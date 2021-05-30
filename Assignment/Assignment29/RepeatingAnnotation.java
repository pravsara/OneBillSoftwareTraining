package com.onebill.corejava.basics.Assignment29;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

public class RepeatingAnnotation {

	@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
	public @interface Games{
		Name[] value() default { };      
	}
	@Name("Ludu")
	@Name("Pubg")
	@Name("FreeFire")
	@Name("HillClimbing")
	@Name("GTA")
	
	public @interface Game{
		String value();
	}
	@Repeatable(value=  Games.class)
	public @interface Name{
		String value();
	}
	
	public static void main(String[] args) {
		
		Name[] a = Game.class.getAnnotationsByType(Name.class);
		Games games = Game.class.getAnnotation(Games.class);
		for(Name m :games.value()) {
			System.out.println(m.value());
		}
	}

}