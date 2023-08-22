import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	public ArrayList<Persona> amigos = new ArrayList<Persona>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void agregarPersona(Persona nuevaPersona) {
		amigos.add(nuevaPersona);
		System.out.println(nuevaPersona.getNombre() + " ha sido agregado como amigo.");
	}

	public Persona buscarPersonaPorNombre(String nombre) {
		for (Persona amigo : amigos) {
			if (amigo.getNombre().equals(nombre)) {
				return amigo;
			}
		}
		return null; // Si no se encuentra a la persona
	}

	public void eliminarPersona(Persona personaAEliminar) {
		if (amigos.contains(personaAEliminar)) {
			amigos.remove(personaAEliminar);
			System.out.println(personaAEliminar.getNombre() + " ha sido eliminado de amigos.");
		} else {
			System.out.println(personaAEliminar.getNombre() + " no está en la lista de amigos.");
		}
	}
}
