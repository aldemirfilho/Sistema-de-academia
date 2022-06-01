public class Iterator_ArrayList_client implements Iterator{
    java.util.List<Cliente> lista;
    int posicao = 0;
    
    //construtor
    public Iterator_ArrayList_client(java.util.List<Cliente> lista) {
        this.lista = lista;
    }
    
    @Override
    public Cliente first() {
        posicao = 0;
        Cliente client = lista.get(posicao);
        return client;
    }
    
    @Override
    public boolean isDone() {
        return posicao == lista.size();
    }
     
    @Override
    public Cliente next() {
        Cliente client = lista.get(posicao);
        posicao++;
        return client;
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
