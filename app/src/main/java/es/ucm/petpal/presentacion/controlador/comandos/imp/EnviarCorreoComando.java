package es.ucm.petpal.presentacion.controlador.comandos.imp;

import android.util.Log;

import es.ucm.petpal.negocio.factoria.FactoriaSA;
import es.ucm.petpal.negocio.usuario.SAUsuario;
import es.ucm.petpal.presentacion.controlador.comandos.Command;
import es.ucm.petpal.presentacion.controlador.comandos.exceptions.commandException;

/**
 * Created by msalitu on 21/03/2016.
 */
public class EnviarCorreoComando implements Command{
    @Override
    public Object ejecutaComando(Object datos) throws commandException {
        SAUsuario saUsuario = FactoriaSA.getInstancia().nuevoSAUsuario();
        saUsuario.enviarCorreo();
        return null;
    }
}
