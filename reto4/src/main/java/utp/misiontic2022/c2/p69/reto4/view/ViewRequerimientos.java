package utp.misiontic2022.c2.p69.reto4.view;

import java.util.ArrayList;

import utp.misiontic2022.c2.p69.reto4.controller.ControllerRequerimientos;

import utp.misiontic2022.c2.p69.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.p69.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.p69.reto4.model.vo.Requerimiento_3;


public class ViewRequerimientos {

    public static final ControllerRequerimientos controlador = new ControllerRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<Requerimiento_1> listarRequerimiento_1;
            listarRequerimiento_1 = controlador.consultarRequerimiento1();

            for(Requerimiento_1 rq: listarRequerimiento_1){
                System.out.println(
                    rq.getFechaCompra() + " " +
                    rq.getCodCompra() + " " +
                    rq.getNombreProveedor() + " " +
                    rq.getPagado()
                );
            }

        } catch (Exception e) { //SQLException
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> listarRequerimiento_2;
            listarRequerimiento_2 = controlador.consultarRequerimiento2();

            for (Requerimiento_2 rq: listarRequerimiento_2){
                System.out.println(
                    rq.getFechaInicio() + " " +
                    rq.getCiudad() + " " +
                    rq.getConstructora() + " " +
                    rq.getNombreLider() + " " +
                    rq.getCodigoTipo() + " " +
                    rq.getEstrato()
                );
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> listarRequerimiento_3;
            listarRequerimiento_3 = controlador.consultarRequerimiento3();

            for (Requerimiento_3 rq: listarRequerimiento_3){
                System.out.println(
                    rq.getNombreAbreviado()
                );
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}

