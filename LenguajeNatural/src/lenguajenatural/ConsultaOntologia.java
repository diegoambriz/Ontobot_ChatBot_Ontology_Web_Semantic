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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Basu
 */
public class ConsultaOntologia {
    String temaP;
    String resultadoSalida;
    
    public ConsultaOntologia(String tema, String propiedad) {
        String prop = propiedad; // aqui va la propiedad
        tema = tema.replace(" ","_");
        String temalocal = tema;
      

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
     
        String replace = resultado1.replace("|","");
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
        
        resultadoSalida = replace;
    }
    
    public String getResultado() {
        return resultadoSalida;
    }
    
}
