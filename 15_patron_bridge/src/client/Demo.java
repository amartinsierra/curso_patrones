package client;

import formaciones.Curso;
import formaciones.Formacion;
import formaciones.Master;
import modalidades.ModalidadOnline;
import modalidades.ModalidadPresencial;

public class Demo {
	public static void main(String[] args) {
        Formacion cursoOnline = new Curso(new ModalidadOnline());
        Formacion masterPresencial = new Master(new ModalidadPresencial());

        cursoOnline.formar();// Curso se imparte completamente online.
        masterPresencial.formar(); // Máster se imparte de forma presencial
                                     // en el aula.
      }

}
