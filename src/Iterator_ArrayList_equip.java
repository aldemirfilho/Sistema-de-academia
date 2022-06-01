public class Iterator_ArrayList_equip implements Iterator{
    java.util.List<Equipamento> lista;
    int posicao = 0;
    
    //construtor
    public Iterator_ArrayList_equip(java.util.List<Equipamento> lista) {
        this.lista = lista;
    }
    
    @Override
    public Equipamento first() {
        posicao = 0;
        Equipamento equip = lista.get(posicao);
        return equip;
    }
    
    @Override
    public boolean isDone() {
        return posicao == lista.size();
    }
     
    @Override
    public Equipamento next() {
        Equipamento equip = lista.get(posicao);
        posicao++;
        return equip;
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
