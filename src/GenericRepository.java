import java.util.List;

public interface GenericRepository<T> {
    void cadastrar(T entidade);
    List<T> listarTodos();
    void atualizar(T entidade);
}