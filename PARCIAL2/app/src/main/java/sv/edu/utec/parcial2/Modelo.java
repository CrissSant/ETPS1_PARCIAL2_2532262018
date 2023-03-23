package sv.edu.utec.parcial2;

public class Modelo {
    private String Nombre;
    private String Cargo;
    private String Compania;
    private int Foto;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getCompania() {
        return Compania;
    }

    public void setCompania(String compania) {
        Compania = compania;
    }

    public int getFoto() {
        return Foto;
    }

    public void setFoto(int foto) {
        Foto = foto;
    }
}
