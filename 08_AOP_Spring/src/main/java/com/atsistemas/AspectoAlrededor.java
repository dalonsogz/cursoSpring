package com.atsistemas;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectoAlrededor {
	public String durante(ProceedingJoinPoint joinPoint, String p){
        long inicio = System.currentTimeMillis();
        System.out.println("Antes de ejecutar el servicio con el dato " + p);
        Object retorno = null;
        try {
              retorno = joinPoint.proceed(new Object[]{"Pepito"});
        } catch (Throwable e) {
                e.printStackTrace();
        }
        long duracion = System.currentTimeMillis() - inicio;
        System.out.println("Despues de ejecutar el servicio, habiendo durado la operacin: " + duracion + " con la persona " + p + " y el resultado: " + retorno);
        
        return "Juanito";
        
}
}
