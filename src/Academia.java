import java.util.ArrayList;
import java.util.List;

public class Academia {

    private String nome;
    private Endereco endereco;
    private Contato contato;
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;
    private Contas contas;
    private List<Cliente> clientesDevendo = new ArrayList<>();
    private List<Equipamento> equipamentos;

    Academia(String nome) {
        this.nome = nome;
        this.contato = new Contato();
        this.endereco = new Endereco();
        this.clientes = new ArrayList<Cliente>();
        this.funcionarios = new ArrayList<Funcionario>();
        this.contas = new Contas();
        this.equipamentos = new ArrayList <Equipamento>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void cadastrarFuncionario(Funcionario f) {
        this.funcionarios.add(f);
        this.contas.setaPagar(f.getSalario());
    }

    public Contas getContas() {
        return contas;
    }

    public void setContas(Contas contas) {
        this.contas = contas;
    }
    
    public void cadastrarEquipamento(Equipamento e) {
        this.equipamentos.add(e);
    }
    
    public void removerEquipamento(int idEquipamentoRemover) {
        Iterator Iterator_ArrayList = new Iterator_ArrayList_equip(equipamentos); //construtor list
        while (Iterator_ArrayList.hasNext()) {
            Equipamento equip = (Equipamento)Iterator_ArrayList.next();
            if(equip.getID() == idEquipamentoRemover) {
                System.out.println("id corrent" + equip.getID());
                System.out.println("id enviado" + idEquipamentoRemover);
       		equipamentos.remove(equip);
                break;
            }
        }
    }
    
    public void removerFuncionario(String CpfFuncionario) {
        Iterator Iterator_ArrayList = new Iterator_ArrayList_func(funcionarios); //construtor list
        while (Iterator_ArrayList.hasNext()) {
            Funcionario func = (Funcionario)Iterator_ArrayList.next();
            if (func.getCpf().equals(CpfFuncionario)) {
                funcionarios.remove(func);
            }
        }
    }

    public void setReceberCliente(List<Cliente> clientes) {
        Iterator Iterator_ArrayList = new Iterator_ArrayList_client(clientes); //construtor list
        while (Iterator_ArrayList.hasNext()) {
            Cliente client = (Cliente)Iterator_ArrayList.next();
            if (!client.isPagamento()) {
                this.contas.setaReceber(client.getPlano().getValorPlano());
            }
        }
    }

    public void setDispesaFuncionario(List<Funcionario> funcionarios) {
        Iterator Iterator_ArrayList = new Iterator_ArrayList_func(funcionarios); //construtor list
        while (Iterator_ArrayList.hasNext()) {
            Funcionario func = (Funcionario)Iterator_ArrayList.next();
            if (!func.isPagamento()) {
                this.contas.setaPagar(func.getSalario());
            }
        }
    }

    public String pagarFuncionario(String CPF) throws cpfNaoExisteException 
    {
	boolean existe = false;
        Iterator Iterator_ArrayList = new Iterator_ArrayList_func(funcionarios); //construtor list
        while (Iterator_ArrayList.hasNext()) {
            Funcionario func = (Funcionario)Iterator_ArrayList.next();
            if (func.getCpf().equals(CPF)) {
                if (!func.isPagamento()) {
                    func.setPagamento(true);
                    this.contas.setNegativoAPagar(func.getSalario());
                    existe = true;
                }
            }
        }
         if (existe != false) {
            return "Mensalidade paga com sucesso!";
        } else {
            throw new cpfNaoExisteException("O CPF não está cadastrado.\n");
        }
    }

    public void cadastrarCliente(Cliente c) {
        this.clientes.add(c);
        this.contas.setaReceber(c.getPlano().getValorPlano());
    }

   public String clientePagar(String CPF) throws cpfNaoExisteException {
        boolean existe = false;
        Iterator Iterator_ArrayList = new Iterator_ArrayList_client(clientes); //construtor list
        while (Iterator_ArrayList.hasNext()) {
            Cliente client = (Cliente)Iterator_ArrayList.next();
            if (client.getCpf().equals(CPF)) {
                if (!client.isPagamento()) {
                    client.setPagamento(true);
                    this.contas.setNegativoReceber(client.getPlano().getValorPlano());
                    existe = true;
                }
            }
        }
        if (existe != false) {
            return "Mensalidade paga com sucesso!";
        } else {
            throw new cpfNaoExisteException("O CPF não está cadastrado.\n");
        }
    }

    public List<Cliente> getclientesDevendo() {
        Iterator Iterator_ArrayList = new Iterator_ArrayList_client(clientes); //construtor list
        while (Iterator_ArrayList.hasNext()) {
            Cliente client = (Cliente)Iterator_ArrayList.next();
            if (!client.isPagamento()) {
                this.clientesDevendo.add(client);
                return this.clientesDevendo;
            }
        }
        return null;
    }

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	
	

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
	
	public String toString() {
		      return "\n Nome: " + this.nome
                + "\n Logradouro: " + this.endereco.getLogradouro()
                + "\n Número: " + this.endereco.getNumero()
                + "\n Complemento: " + this.endereco.getComplemento()
                + "\n Bairro: " + this.endereco.getBairro()
                + "\n Cidade: " + this.endereco.getCidade()
                + "\n Estado: " + this.endereco.getEstado()
                + "\n Email: " + this.contato.getEmail()
                + "\n Telefone: " + this.contato.getTelefone().getDd() + " " + this.contato.getTelefone().getNumero();
    }
}
