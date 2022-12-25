package Test.TD6Test;
import static org.junit.jupiter.api.Assertions.*;

import main.TD6.CompteEpargne;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CompteEpargneTests {
    static int i=0;
    CompteEpargne sansNom;
    CompteEpargne avecNom;
    CompteEpargne Tawfir;

    @BeforeEach
    void setUp() {
        sansNom = new CompteEpargne();
        avecNom = new CompteEpargne("ahmed", 1, 1000, 0.1);
        Tawfir = new CompteEpargne("ali", 1, 1000, 1000);
    }

    @BeforeAll
    static void setUpAll() {

        System.out.println("***** Début des tests de la classe CompteEpargne*****");
    }


    @Test
    public void testGetNom(){
        CompteEpargne compteEpargne = new CompteEpargne("test", 1, 1000, 0.1);
        assertEquals("test", compteEpargne.getNom());
    }
    @Test
    public void testGetNomReturNull(){
        CompteEpargne compteEpargne = new CompteEpargne(null, 1, 1000, 0.1);
        assertNull(compteEpargne.getNom());
    }
    @Test
    public void testCompteReturnObjectNull(){
        CompteEpargne compteEpargne = new CompteEpargne("Test", 1, 1000, 0.1);
        assertNotNull(compteEpargne);
    }
    @Test
    void GetNomreturnNllSileNomestNonInitialise(){
        CompteEpargne compteEpargne = new CompteEpargne();
        assertNull(compteEpargne.getNom());
        CompteEpargne avecNom = new CompteEpargne("Test", 1, 1000, 0.1);
        assertEquals("Test", avecNom.getNom());
    }
    @Test
    void CompteEpargneReturnObjectNonNull(){
        CompteEpargne compteEpargne = new CompteEpargne("Test", 1, 1000, 0.1);
        assertNotNull(compteEpargne);
    }
    @Test
    void testNomGetNomReturnNUllSiNomNonInitialise(){
        CompteEpargne compteEpargne = new CompteEpargne();
        assertNull(compteEpargne.getNom());
    }
    @Test
    void GetNomRetutnNomSiNomInitialise(){
        CompteEpargne compteEpargne = new CompteEpargne("Test", 1, 1000, 0.1);
        assertEquals("Test", compteEpargne.getNom());
    }
    @Test
    void CompteEpargneReturnObjectNotNull(){
        CompteEpargne compteEpargne = new CompteEpargne("Test", 1, 1000, 0.1);
        assertNotNull(compteEpargne);

    }

    @Test
    @DisplayName("getNom() return null if nom is not initialized")
    @Order(3)
    void GetNomReturnNullSiNomNonInitialise(){
        CompteEpargne compteEpargne = new CompteEpargne();
        assertNull(compteEpargne.getNom());
        i++;
        System.out.println("GetNomReturnNullSiNomNonInitialise: "+i);
    }
    @Test
    @DisplayName("getNom return nom si nom initialisé")
    @Order(2)
    void GetNomReturnNomSiNomInitialise(){
        CompteEpargne compteEpargne = new CompteEpargne("Test", 1, 1000, 0.1);
        assertEquals("Test", compteEpargne.getNom());
        i++;
        System.out.println("GetNomReturnNomSiNomInitialise: "+i);
    }
    @Test
    @DisplayName("getNom return null si nom non initialisé")
    @Order(1)
    void CompteEpargneReturneObjectNotNull(){
        CompteEpargne compteEpargne = new CompteEpargne("Ali", 5222, 1000, 0.1);
        assertNotNull(compteEpargne);
        i++;
        System.out.println("CompteEpargneReturnObjectNotNull: "+i);
    }
    @Test
    @DisplayName("getNom return null si nom non initialisé")
    @Order(4)
    void GetNomReturnNomSQuandIlEstInitialise(){
        CompteEpargne compteEpargne = new CompteEpargne("Test", 1, 1000, 0.1);
        String obtenue = compteEpargne.getNom();
        assertEquals("Test", obtenue);
    }
    @Test
    @DisplayName("getNom return null si nom non initialisé")
    @Order(5)
    void CompteEpargneReturnObjectNotNull2(){
        CompteEpargne compteEpargne = new CompteEpargne();
        String obtenue = compteEpargne.getNom();
        assertNull(obtenue);
    }
    @Test
    @DisplayName("retire refuse les montants negatifs")
    @Order(6)
    void RetireRefuseLesMontantsNegatifs(){
        CompteEpargne compteEpargne = new CompteEpargne("Test", 1, 1000, 0.1);
        compteEpargne.debiter(-100);
        double soldePrevu = 1000;
        double soldeObtenu = compteEpargne.getSolde();
        assertEquals(soldePrevu, soldeObtenu);

    }
    @Test
    @DisplayName("retire accepte les montants positifs")
    @Order(7)
    void RetireAccepteLesMontantsPositifs(){
        avecNom.debiter(100);
        double soldePrevu = 900;
        double soldeObtenu = avecNom.getSolde();
        assertEquals(soldePrevu, soldeObtenu);
    }
    @Test
    @DisplayName("depot refuse les montants negatifs")
    @Order(8)
    void DepotRefuseLesMontantsNegatifs(){
        avecNom.deposer(-100);
        double soldePrevu = 1000;
        double soldeObtenu = avecNom.getSolde();
        assertEquals(soldePrevu, soldeObtenu);
    }

    @Test
    @DisplayName("depot accepte les montants positifs")
    @Order(9)
    void DepotAccepteLesMontantsPositifs(){
        avecNom.deposer(100);
        double soldePrevu = 1100;
        double soldeObtenu = avecNom.getSolde();
        assertEquals(soldePrevu, soldeObtenu);
    }
    







}
