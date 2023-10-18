/**
 * Registro que agrupa los datos de un Torneo
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo.torneodeportivo;

import java.time.LocalDate;

public class Torneo {
    private final String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaInicioInscripciones;
    private LocalDate fechaCierreInscripciones;
    private final byte numeroParticipantes;
    private final byte limiteEdad;
    private final int valorInscripcion;

    public Torneo(String nombre, LocalDate fechaInicio,
            LocalDate fechaInicioInscripciones,
            LocalDate fechaCierreInscripciones, byte numeroParticipantes,
            byte limiteEdad, int valorInscripcion) {
        assert nombre != null;
        
        
        
        assert numeroParticipantes >= 0;
        assert limiteEdad >= 0;
        assert valorInscripcion >= 0;
     
        this.nombre = nombre;
        
        setFechaInicioInscripciones(fechaInicioInscripciones);
        this.fechaCierreInscripciones = fechaCierreInscripciones;
        setFechaInicio(fechaInicio);
        this.numeroParticipantes = numeroParticipantes;
        this.limiteEdad = limiteEdad;
        this.valorInscripcion = valorInscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaInicioInscripciones() {
        return fechaInicioInscripciones;
    }

    public LocalDate getFechaCierreInscripciones() {
        return fechaCierreInscripciones;
    }

    public byte getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public byte getLimiteEdad() {
        return limiteEdad;
    }

    public int getValorInscripcion() {
        return valorInscripcion;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        assert fechaInicio != null;
        assert ( fechaInicioInscripciones == null || fechaInicio.isAfter(fechaInicioInscripciones) ) &&
                ( fechaCierreInscripciones == null || fechaInicio.isAfter(fechaCierreInscripciones) ) &&
                (fechaCierreInscripciones.isBefore(fechaInicio));
        this.fechaInicio = fechaInicio;
    }

    public void setFechaInicioInscripciones(LocalDate fechaInicioInscripciones) {
        assert fechaInicioInscripciones != null;
        assert fechaInicioInscripciones.isAfter(fechaCierreInscripciones);
        this.fechaInicioInscripciones = fechaInicioInscripciones;
    }
    public void setFechaCierreInscripciones(LocalDate fechaCierreInscripciones) {
        assert fechaCierreInscripciones != null;
        assert fechaCierreInscripciones.isAfter(fechaInicioInscripciones);
        this.fechaCierreInscripciones = fechaCierreInscripciones;
    }

    
}
