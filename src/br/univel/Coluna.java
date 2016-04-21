package br.univel;

public @interface Coluna {

	String nome() default "";

	boolean pk() default false;

}
