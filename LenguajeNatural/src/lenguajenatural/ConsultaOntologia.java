/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajenatural;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.ResultSetFormatter;

import static com.hp.hpl.jena.assembler.JA.PrefixMapping;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.query.Syntax;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;
import java.awt.Color;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.query.Syntax;


import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.hp.hpl.jena.shared.PrefixMapping;

import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.util.*;



import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Basu
 */
public class ConsultaOntologia {
    private String resultadoSalida;
    private String listaProps;
    
    public ConsultaOntologia() {
        
    }
    
    public ConsultaOntologia(String tema, String pregunta) {
         // aqui va la propiedad
        String propiedad = getPropiedad(tema, pregunta);
        tema = tema.replace(" ","_");
        
        String temalocal = tema;
        String prop = propiedad;
        
        String replace = "";
                
        if(prop != "") {
            String consulta=
                "PREFIX dbpedia-owl: <http://dbpedia.org/ontology/>"+
                "PREFIX rdf:<http://www.w3.org/TR/2008/REC-rdf-sparql-query-20080115/>"+
                "PREFIX xml:<http://www.w3.org/XML/1998/namespace>"+
                "PREFIX  g:    <http://www.w3.org/2003/01/geo/wgs84_pos#> "+
                "PREFIX  rdfs: <http://www.w3.org/2000/01/rdf-schema#> "+
                "PREFIX  onto: <http://dbpedia.org/ontology/>"+
                "PREFIX dcterms: <http://purl.org/dc/terms/>"+
                "PREFIX dbo:   <http://dbpedia.org/ontology/>"+
                "PREFIX esdbp: <http://es.dbpedia.org/property/> \n" +
                "PREFIX esdbr: <http://es.dbpedia.org/resource/> \n" +
                "SELECT ?"+prop+" WHERE { \n" +
                "esdbr:"+temalocal+" esdbp:"+prop+"  ?"+prop+" .\n" +
                "\n" +
                "}";
       
            Query query = QueryFactory.create(consulta); 
            QueryExecution qExe = QueryExecutionFactory.sparqlService( "http://es.dbpedia.org/sparql", query );
            ResultSet resultado = qExe.execSelect();
            //ResultSetFormatter.out(System.out, resultado, query) ;
            String resultado1 = ResultSetFormatter.asText(resultado);
     
            replace = resultado1.replace("|","");
            replace =  replace.replace("-","");
            replace =replace.replace("_"," ");
            replace =replace.replace("=","");
            replace =replace.replace(prop,"");
            replace =replace.replace("<","");
            replace =replace.replace(">","");
            replace =replace.replace("http://es.dbpedia.org/resource/","");
            replace =replace.replace("\"\"","");
            replace =replace.replace("@es","");
            replace =replace.replace("\"","");   
        } else {
            replace = "";
        }
        
      

        
        
        resultadoSalida = replace;
    }
    
    public String getResultado() {
        return resultadoSalida;
    }
    
    public void getTodasPropiedades(String tema) {
        /*tema = tema.replace(" ","_");
        
        String consulta="SELECT  ?p \n" +
        "WHERE \n" +
        "  {\n" +
        "     <http://es.dbpedia.org/resource/"+tema+">  ?p  ?o\n" +
        "  }";
        
        Query query = QueryFactory.create(consulta); 
        QueryExecution qExe = QueryExecutionFactory.sparqlService( "http://es.dbpedia.org/sparql", query );
        ResultSet resultado = qExe.execSelect();
        String resultadocad = ResultSetFormatter.asText(resultado);
         
        
       String pat = "(property/)(.*?) ";
       Pattern pattern = Pattern.compile(pat);
       Matcher matcher = pattern.matcher(resultadocad);
       String props="";
       while(matcher.find()) 
       {
            //System.out.println( matcher.group(2) );
           if(!props.contains(matcher.group(2)))
            props= props +   matcher.group(2);                      
       }
       props =  props.replace(">","\n");*/
       //listaProps = new ArrayList<String>();
       //listaProps.add(props);
       switch(tema){
            case "Ferrari":
                this.listaProps = "Año de fundación, Fundador de la empresa, Tipo de industria, Productos, Sede, Sitio Web";            
                break;
            case "Bill Gates":
                this.listaProps = "Lugar de nacimiento, Nombre Completo, Ocupación, Padres, Patrimonio, Sitio Web";
                break;
            case "Apple":
                this.listaProps = "Administracion, Número de empleados, Fundador, Tipo de industria, Ingresos, Productos, Sitio Web";
                break;
            case "Steve Jobs":
                this.listaProps = "Universidad, Conocido por.., Lugar de fallecimiento, Lugar de nacimiento, Nacionalidad, Nombre completo, Ocupación, Padres,";
                break;
            case "Batman":
                this.listaProps = "Aliados, Apodo, Equipos, Creador, Habilidades, Nombre verdadero, Compañía, Padres, Ciudad";
                break;
            case "Cristiano Ronaldo":
                this.listaProps = "Debut, Apodo, Club actual, Deporte, Equipos, Liga, Lugar de Nacimiento, Nacionalidad, Nombre completo, País, Posición, Titulos, Número de playera, Goles en club, Goles en selección, Partidos en selección";
                break;
            case "Python":
                this.listaProps = "Año, Desarrollador, Diseñador, Estensiones comunes, Lenguajes que se basan en él, Influido por, Paradigma, Sistemas operativos,Sitio Web";
                break;
            case "Francia":
                this.listaProps = "Himno Nacional, Capital, Ciudad más poblada, Código telefónico, Dirigentes, Gentilicio, Forma de Gobierno, Idioma, Lema, Moneda, Nombre Oficial, Población";
                break;
            default:
                
        }
    }
    
    public String getListaPropiedades(){
        return this.listaProps;
    }
    
    private String getPropiedad(String tema, String pregunta) {
        String propiedad = "";
        pregunta = pregunta.toLowerCase();
        
        switch(tema){
            case "Ferrari":
                if (pregunta.contains("fundó") && pregunta.contains("cuándo"))
                    propiedad = "fundación";
                else if (pregunta.contains("fundador") || (pregunta.contains("fundó") && pregunta.contains("quién")))
                    propiedad = "fundador";
                else if (pregunta.contains("industria") || pregunta.contains("ramo"))
                    propiedad = "industria";
                else if (pregunta.contains("productos"))
                    propiedad = "productos";
                else if (pregunta.contains("sede") || pregunta.contains("ubica"))
                    propiedad = "sede";
                else if (pregunta.contains("web") || pregunta.contains("internet"))
                    propiedad = "sitioWeb";               
                break;
            case "Bill Gates":
                if (pregunta.contains("nacimiento") || pregunta.contains("nació"))
                    propiedad = "lugarDeNacimiento";
                else if (pregunta.contains("nombre completo"))
                    propiedad = "nombreCompleto";
                else if (pregunta.contains("ocupación") || pregunta.contains("dedica"))
                    propiedad = "ocupación";
                else if (pregunta.contains("padres"))
                    propiedad = "padres";
                else if (pregunta.contains("patrimonio"))
                    propiedad = "patrimonio";
                else if (pregunta.contains("web") || pregunta.contains("internet"))
                    propiedad = "web";
                break;
            case "Apple":
                if (pregunta.contains("administración") || pregunta.contains("dirige"))
                    propiedad = "administración";
                else if (pregunta.contains("empleados"))
                    propiedad = "empleados";
                else if (pregunta.contains("fundó") || pregunta.contains("fundador"))
                    propiedad = "fundador";
                else if (pregunta.contains("ramo") || pregunta.contains("industria"))
                    propiedad = "industria";
                else if (pregunta.contains("ingresos"))
                    propiedad = "ingresos";
                else if (pregunta.contains("productos"))
                    propiedad = "productos";
                else if (pregunta.contains("sitio") || pregunta.contains("web") || pregunta.contains("página"))
                    propiedad = "sitioWeb";
                break;
            case "Steve Jobs":
                if (pregunta.contains("universidad"))
                    propiedad = "almaMáter";
                else if (pregunta.contains("conocido"))
                    propiedad = "conocido";
                else if (pregunta.contains("murió") || pregunta.contains("falleció"))
                    propiedad = "lugarDeFallecimiento";
                else if (pregunta.contains("nació"))
                    propiedad = "lugarDeNacimiento";
                else if (pregunta.contains("nacionalidad"))
                    propiedad = "nacionalidad";
                else if (pregunta.contains("nombre completo"))
                    propiedad = "nombreCompleto";
                else if (pregunta.contains("ocupación"))
                    propiedad = "ocupación";
                else if (pregunta.contains("padres"))
                    propiedad = "padres";
                break;
            case "Batman":
                if (pregunta.contains("aliados"))
                    propiedad = "aliados";
                else if (pregunta.contains("apodo") || pregunta.contains("alias") || pregunta.contains("otros nombres"))
                    propiedad = "alias";
                else if (pregunta.contains("conexiones") || pregunta.contains("equipos") || pregunta.contains("grupos"))
                    propiedad = "conexiones";
                else if (pregunta.contains("creador"))
                    propiedad = "creador";
                else if (pregunta.contains("especialidad") || pregunta.contains("habilidad"))
                    propiedad = "especialidad";
                else if (pregunta.contains("nombre verdadero") || pregunta.contains("verdadero nombre") || pregunta.contains("nombre real") || pregunta.contains("identidad"))
                    propiedad = "nombreOriginal";
                else if (pregunta.contains("compañía"))
                    propiedad = "obra";
                else if (pregunta.contains("padres"))
                    propiedad = "padres";
                else if (pregunta.contains("primera"))
                    propiedad = "primera";
                else if (pregunta.contains("ciudad"))
                    propiedad = "residencia";
                break;
            case "Cristiano Ronaldo":
                if (pregunta.contains("debut"))
                    propiedad = "equipoDebut";
                else if (pregunta.contains("apodo"))
                    propiedad = "apodo";
                else if (pregunta.contains("club actual") || pregunta.contains("equipo actual") || pregunta.contains("equipo juega"))
                    propiedad = "club";
                else if (pregunta.contains("deporte"))
                    propiedad = "deporte";
                else if (pregunta.contains("equipos"))
                    propiedad = "equipos";
                else if (pregunta.contains("liga"))
                    propiedad = "liga";
                else if (pregunta.contains("nacimiento") || pregunta.contains("nació"))
                    propiedad = "lugarNacimiento";
                else if (pregunta.contains("nacionalidad"))
                    propiedad = "nacionalidad";
                else if (pregunta.contains("nombre completo"))
                    propiedad = "nombrecompleto";
                else if (pregunta.contains("pais") || pregunta.contains("país"))
                    propiedad = "país";
                else if (pregunta.contains("posición") || pregunta.contains("posicion"))
                    propiedad = "posición";
                else if (pregunta.contains("títulos") || pregunta.contains("titulos"))
                    propiedad = "títulos";
                else if (pregunta.contains("dorsal") || pregunta.contains("número") || pregunta.contains("playera"))
                    propiedad = "dorsal";
                else if (pregunta.contains("gol") && pregunta.contains("club"))
                    propiedad = "golesClubes";
                else if (pregunta.contains("gol") && pregunta.contains("selección"))
                    propiedad = "golesInternacional";
                else if ((pregunta.contains("jugado") || pregunta.contains("juego") || pregunta.contains("partido")) && pregunta.contains("selección"))
                    propiedad = "vecesInternacional";
                break;
            case "Python":
                if (pregunta.contains("año"))
                    propiedad = "año";
                else if (pregunta.contains("desarrollador"))
                    propiedad = "desarrollador"; 
                else if (pregunta.contains("diseñador") || pregunta.contains("creador") || pregunta.contains("creó") || pregunta.contains("programó"))
                    propiedad = "diseñador";
                else if (pregunta.contains("extensión") || pregunta.contains("extension") || pregunta.contains("extensiones"))
                    propiedad = "extensionesComunes";
                else if (pregunta.contains("basan en") || pregunta.contains("han sido influenciados"))
                    propiedad = "haInfluido";
                else if (pregunta.contains("influido"))
                    propiedad = "influidoPor";
                else if (pregunta.contains("paradigma"))
                    propiedad = "paradigma";
                else if (pregunta.contains("operativo"))
                    propiedad = "sistemaOperativo";
                else if (pregunta.contains("web") || pregunta.contains("internet"))
                    propiedad = "web";                
                break;
            case "Francia":
                if (pregunta.contains("himno"))
                    propiedad = "himnoNacional";
                else if (pregunta.contains("capital"))
                    propiedad = "capital";
                else if (pregunta.contains("ciudad mas poblada") || pregunta.contains("ciudad más poblada"))
                    propiedad = "ciudadMásPoblada";
                else if (pregunta.contains("código telefónico") || pregunta.contains("código de teléfono"))
                    propiedad = "códigoTelefónico";
                else if (pregunta.contains("dirige"))
                    propiedad = "dirigentesNombres";
                else if (pregunta.contains("título") || pregunta.contains("titulo"))
                    propiedad = "dirigentesTítulos";
                else if (pregunta.contains("gentilicio"))
                    propiedad = "gentilicio";
                else if (pregunta.contains("gobierno"))
                    propiedad = "gobierno";
                else if (pregunta.contains("idioma"))
                    propiedad = "idioma";
                else if (pregunta.contains("lema"))
                    propiedad = "lemaNacional";
                else if (pregunta.contains("moneda"))
                    propiedad = "moneda";
                else if (pregunta.contains("nombre oficial"))
                    propiedad = "nombreOficial";
                else if (pregunta.contains("población") || pregunta.contains("poblacion"))
                    propiedad = "población";
                break;
            default:
                
        }
        
        return propiedad;
    }
    
}
