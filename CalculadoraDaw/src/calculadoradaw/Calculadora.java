package calculadoradaw;

public class Calculadora {

    private int op1;
    private int op2;
    private int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public Calculadora() {
    }

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public int suma(int op1, int op2) {

        setResultado(op1 + op2);
        return getResultado();
    }
<<<<<<< HEAD
    
    public int resta(int op1, int op2){
        setResultado(op1 - op2);
        return getResultado();
=======

    public int resta(int op1, int op2) {
        return (op1 - op2);
>>>>>>> 2059623a439169a771a455c28ef16e58444afa68
    }

    public int multiplica(int op1, int op2) {

        setResultado(op1 * op2);
        return getResultado();
    }

    public int divide(int op1, int op2) {
        return (op1 / op2);
    }

}
