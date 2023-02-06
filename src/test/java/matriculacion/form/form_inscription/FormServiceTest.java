package matriculacion.form.form_inscription;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import matriculacion.form.catalogue.Catalogue;

public class FormServiceTest {
    
    @Mock
    private FormInscriptionRepository formRepository;

    @InjectMocks
    private FormService formService;

    private FormInscription formInscription;
     
    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);

        formInscription = new FormInscription();
    }
    @Test
    void testFindAll() {
        when(formRepository.findAll()).thenReturn(Arrays.asList(formInscription));
        assertNotNull(formRepository.findAll());
        assertEquals(Arrays.asList(formInscription), formRepository.findAll());
    }
}
