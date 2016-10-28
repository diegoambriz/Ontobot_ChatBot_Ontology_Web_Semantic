grammar MyGrammar;

@header {
package lenguajenatural;
import java.util.HashMap;
}

s 	: 	np vp {System.out.println($np.cad); }
	;
np returns[String cad]:	DT N {System.out.println("DT: " + $DT.text + "N: " + $N.text ); $cad = "HOLACADENA";}
	|	N
	;
vp:	V np 
	|	V
	;
pp:	
	|	np 
	;
DT 	:	'el' 
	|	'los'
	;
N  :	'hombre'|'amigos'|'cafe'|'leche' //implementar un diccionario
	;
V  :	'toma'| 'toman' //implementar un diccionario
	;
P  :	'con'//implementar un diccionario
	;
WS : [ \t\r\n]+ -> skip ;
