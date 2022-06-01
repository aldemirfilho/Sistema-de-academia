public class Iterator_ArrayList_func implements Iterator{
    java.util.List<Funcionario> lista;
    int posicao = 0;
    
    //construtor
    public Iterator_ArrayList_func(java.util.List<Funcionario> lista) {
        this.lista = lista;
    }
    
    @Override
    public Funcionario first() {
        posicao = 0;
        Funcionario func = lista.get(posicao);
        return func;
    }
    
    @Override
    public boolean isDone() {
        return posicao == lista.size();
    }
     
    @Override
    public Funcionario next() {
        Funcionario func = lista.get(posicao);
        posicao++;
        return func;
    }
     
    @Override
    public boolean hasNext() {
        if (posicao >= lista.size() || lista.get(posicao) == null) {
            return false;
        } else {
            return true;
        }
    }
}
