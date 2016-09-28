grammar Gramatica;

s 	: 	np vp
	;
np	:	DT N
	|	N
	;
vp	:	V np
	|	V
	;
pp	:	P
	|	np
	;
DT	:	'el'
	|	'los'
	;
N	:	'hombre'|'amigos'|'cafe'|'leche' //implementar un diccionario
	;
V 	:	'toma' | 'toman' //implementar un diccionario
	;
P 	:	'con'//implementar un diccionario
	;
WS : [ \t\r\n]+ -> skip ;
