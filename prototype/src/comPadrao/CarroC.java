/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class CarroC implements Cloneable {

    private String modelo;
    private String cor;

    public CarroC(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public CarroC clone() throws CloneNotSupportedException {
        try {
            return (CarroC) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone não suportado", e);
        }
    }

    @Override
    public String toString() {
        return "Carro{"
                + "modelo='" + modelo + '\''
                + ", cor='" + cor + '\''
                + '}';
    }
}
