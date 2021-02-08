package in.pbehre.store;

import com.google.protobuf.MapEntry;
import in.pbehre.exceptions.TodoAlreadyExists;
import in.pbehre.exceptions.TodoNotFoundException;
import in.pbehre.proto.GetTodoRequest;
import in.pbehre.proto.GetTodoResponse;
import in.pbehre.proto.TodoAddRequest;
import in.pbehre.proto.TodoAddResponse;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

public class TodoStore {
    private ConcurrentMap<Integer, String> store;
    public static final Logger logger = Logger.getLogger(TodoStore.class.getName());
    public TodoStore() {
        store = new ConcurrentHashMap<>();
    }

    public int add(TodoAddRequest todo) throws TodoAlreadyExists {
        int id = todo.getId();
        String todoValue = todo.getTodo();
        if(!store.containsKey(id))
        {
            logger.info("Adding Todo: " + todo.toString());
            store.putIfAbsent(id, todoValue);
            return id;
        } else {
            logger.warning("Todo with given id already Exists: " + todo.toString());
            throw new TodoAlreadyExists("Given ID already exists");
        }
    }

    public GetTodoResponse getTodo(GetTodoRequest todo) throws TodoNotFoundException {
        if(store.containsKey(todo.getId()))
        {
            return GetTodoResponse.newBuilder()
                    .setId(todo.getId())
                    .setTodo(store.get(todo.getId()))
                    .build();
        }
        logger.warning("No todo with given id exists: " + todo.toString());
        throw new TodoNotFoundException("No TODO with that id exists");
    }

    public Collection<GetTodoResponse> GetAll()
    {
        Collection<GetTodoResponse> all = new HashSet<GetTodoResponse>();
        for(Map.Entry<Integer, String> entry: store.entrySet())
        {
            all.add(GetTodoResponse.newBuilder()
            .setId(entry.getKey())
            .setTodo(entry.getValue())
            .build());
        }
        return all;
    }
}
