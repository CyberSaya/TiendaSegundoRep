
package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;


public interface ReporteService {
    
    public ResponseEntity<Resource>
            generaReporte (
                    
                    String reporte, // Recibe el nombre del archivo llamado .jasper
                    Map<String, Object> parametros, // Recibe Los parametros del reporte si tiene parametros
                    String tipo // La salida El tipo de reporte ... PDF, XLs, Csv, vPdf
            
            )throws  IOException;
    
}
