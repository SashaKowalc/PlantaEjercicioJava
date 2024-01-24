package logica;

public abstract class Planta {
    
    private String nombre;
    private int altoDelTallo;
    private boolean tieneHojas;
    private String climaIdeal;
    
    public abstract void Saludar();

    public Planta() {
    }

    public Planta(String nombre, int altoDelTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoDelTallo = altoDelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltoDelTallo() {
        return altoDelTallo;
    }

    public void setAltoDelTallo(int altoDelTallo) {
        this.altoDelTallo = altoDelTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    
    
}
