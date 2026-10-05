
/**
 * Corrida de aplicativo na Xulambs Ride.
 * Classe fornecida (já implementada).
 */
public class Corrida {
    private String codigo;
    private double km;
    private double valor;
    private boolean concluida;

    public Corrida(String codigo, double km, double valor) {
        this.codigo = codigo == null ? "" : codigo;
        this.km = km < 0 ? 0 : km;
        this.valor = valor < 0 ? 0 : valor;
        this.concluida = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getKm() {
        return km;
    }

    public double getValor() {
        return valor;
    }

    public boolean estaConcluida() {
        return concluida;
    }

    public void concluir() {
        concluida = true;
    }
}
