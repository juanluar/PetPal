package es.ucm.petpal.presentacion.controlador.imp;

import android.util.Log;

import es.ucm.petpal.presentacion.controlador.Controlador;
import es.ucm.petpal.presentacion.controlador.Dispatcher;
import es.ucm.petpal.presentacion.controlador.comandos.Command;
import es.ucm.petpal.presentacion.controlador.comandos.exceptions.commandException;
import es.ucm.petpal.presentacion.controlador.comandos.factoria.FactoriaComandos;

/**
 * Created by Jeffer on 02/03/2016.
 */
public class ControladorImp extends Controlador {
    @Override
    public void ejecutaComando(String accion, Object datos) {
        Command comando = FactoriaComandos.getInstancia().getCommand(accion);
        Object ret;
        try {
            ret = comando.ejecutaComando(datos);
            actualizaVista(accion,ret);
        } catch (commandException e) {
            // TODO Auto-generated catch block
            //AQUI SEGURAMENTE HAGA FALTA OTRO METOODO PARA QUE EL DISPATCHER LANCE ERROREs

        }
    }

    @Override
    public void actualizaVista(String accion, Object datos) {
        Dispatcher.getInstancia().dispatch(accion, datos);
    }
}
