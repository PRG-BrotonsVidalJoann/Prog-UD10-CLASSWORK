package es.progcipfpbatoi.todolistspring.model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Tarea {

    private int codigo;

    private String usuario;

    private String descripcion;

    private LocalDateTime creadoEn;
    
    private Prioridad prioridad;
    
    private boolean realizada;
    
    private LocalDate fechaVencimiento;
    
    private LocalTime horaVencimiento;

    public Tarea(int codigo, String usuario, String descripcion, Prioridad prioridad, boolean realizada, LocalDate fechaVencimiento, LocalTime horaVencimiento) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.creadoEn = LocalDateTime.now();
        this.prioridad = prioridad;
        this.realizada = realizada;
        this.fechaVencimiento = fechaVencimiento;
        this.horaVencimiento = horaVencimiento;
    }

    public String getUsuario() {
		return usuario;
	}

	public String getDescripcion() {
		return descripcion;
	}	
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public int getCodigo() {
        return codigo;
    }
	@Override
	public String toString() {
		return "Tarea con el codigo: " + codigo + ", con nombre=" + usuario + ", con descripcion: " + descripcion + ", creado en: "
				+ creadoEn + ", prioridad=" + prioridad + ", realizada=" + realizada + ", fechaVencimiento="
				+ fechaVencimiento + ", horaVencimiento=" + horaVencimiento;
	}
    
    
}
