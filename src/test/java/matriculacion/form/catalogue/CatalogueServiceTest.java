package matriculacion.form.catalogue;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CatalogueServiceTest {

    @Mock
    private CatalogueRepository catalogueRepository;

    @InjectMocks
    private CatalogueService catalogueService;

    private Catalogue catalogue;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);

        catalogue = new Catalogue();
    }
    
    @Test
    void testFindAll() {
        when(catalogueRepository.findAll()).thenReturn(Arrays.asList(catalogue));
        assertNotNull(catalogueRepository.findAll());
        assertEquals(Arrays.asList(catalogue), catalogueRepository.findAll());
    }
}
