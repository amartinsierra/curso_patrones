package cliente;

import java.util.List;

import builder.Curso;
import composite.Exercise;
import composite.Lesson;
import composite.Test;

public class Demo {

	public static void main(String[] args) {
		Curso curso=new Curso.CursoBuilder("Java")
				.nuevoModulo("m1", new Lesson("l1"),new Exercise("e1"))
				.nuevoModulo("m2", new Lesson("l2"),new Exercise("e2"))
				.nuevoModulo("m3", new Lesson("l1"),new Lesson("l2"),new Lesson("l3"),new Test("t1",List.of("q1","q2")))
				.build();
		curso.showCourse();

	}

}
