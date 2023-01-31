package cecy.matriculacion.matriculacion.catalogue;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

/**
 * Rol
 */
@Data
@Table(name = "catalogue", schema = "catalogue")

public class Catalogue {
    @Id
    @Column("id")
    private long id;
    private String code;
    private String value;
}
