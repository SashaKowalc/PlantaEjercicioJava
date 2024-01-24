package logica;

public class Flor extends Planta {
    
    private String colorPetalos;
    private int cantidadPetalos;
    private String colorPistillo;
    private String variedadFlor;
    private String estacionFlorece;
    
    public Flor() {
    }

    public Flor(String colorPetalos, int cantidadPetalos, String colorPistillo, String variedadFlor, String estacionFlorece) {
        this.colorPetalos = colorPetalos;
        this.cantidadPetalos = cantidadPetalos;
        this.colorPistillo = colorPistillo;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantidadPetalos() {
        return cantidadPetalos;
    }

    public void setCantidadPetalos(int cantidadPetalos) {
        this.cantidadPetalos = cantidadPetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }

    @Override
    public void Saludar() {
        System.out.println("Hola soy una flor");
    }
    
}
