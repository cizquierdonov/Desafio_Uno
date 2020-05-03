package com.previred.lost.periods.domain.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Domain class that represents a lost period that will be returned by Lost
 * Period REST API. This entity is the payload of service reponse object. The
 * next fields describe structure of lost period entity: <br/>
 * <ul>
 * <li>{@link LostPeriods#id}: Number identifier of a random period generated by
 * GDD REST service.</li>
 * <li>{@link LostPeriods#fechaCreacion}: Random first month day date generated
 * by GDD REST service that represents minimum date of the range.</li>
 * <li>{@link LostPeriods#fechaFin}: Random first month day date generated by
 * GDD REST service that represents maximum date of the range.</li>
 * <li>{@link LostPeriods#fechas}: Random list of first month day dates between
 * {@link LostPeriods#fechaCreacion} and {@link LostPeriods#fechaFin} generated
 * by GDD REST service.</li>
 * <li>{@link LostPeriods#fechasFaltantes}: List of month day dates between
 * {@link LostPeriods#fechaCreacion} and {@link LostPeriods#fechaFin} calculated
 * by Lost Period REST API that are not included in {@link LostPeriods#fechas}
 * list.</li>
 * </ul>
 * <br/>
 * <i>NOTE: Both {@link LostPeriods#fechaCreacion} and
 * {@link LostPeriods#fechaFin} are included as a possible lost dates to insert
 * in {@link LostPeriods#fechasFaltantes} list.</i>
 * 
 * @author Carlos Izquierdo
 * @author izqunited@gmail.com
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LostPeriods implements Serializable {

    private static final long serialVersionUID = 7526222034503201234L;

    private Long id;
    private LocalDate fechaCreacion;
    private LocalDate fechaFin;
    private List<LocalDate> fechas;
    private List<LocalDate> fechasFaltantes;
}
