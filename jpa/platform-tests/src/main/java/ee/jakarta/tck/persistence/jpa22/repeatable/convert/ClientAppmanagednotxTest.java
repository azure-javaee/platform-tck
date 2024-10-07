package ee.jakarta.tck.persistence.jpa22.repeatable.convert;

import ee.jakarta.tck.persistence.jpa22.repeatable.convert.Client;
import java.net.URL;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.jboss.arquillian.container.test.api.OverProtocol;
import org.jboss.arquillian.container.test.api.TargetsContainer;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.StringAsset;
import org.jboss.shrinkwrap.api.exporter.ZipExporter;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import tck.arquillian.porting.lib.spi.TestArchiveProcessor;
import tck.arquillian.protocol.common.TargetVehicle;
import com.sun.ts.lib.harness.Status;


@ExtendWith(ArquillianExtension.class)
@Tag("persistence")
@Tag("platform")
@Tag("tck-appclient")

@TestMethodOrder(MethodOrderer.MethodName.class)
public class ClientAppmanagednotxTest extends ee.jakarta.tck.persistence.jpa22.repeatable.convert.Client {
    static final String VEHICLE_ARCHIVE = "jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle";

    public static void main(String[] args) {
      ClientAppmanagednotxTest theTests = new ClientAppmanagednotxTest();
      Status s = theTests.run(args, System.out, System.err);
      s.exit();
    }

        /**
        EE10 Deployment Descriptors:
        jpa_jpa22_repeatable_converts: META-INF/persistence.xml
        jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_client: META-INF/application-client.xml
        jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_ejb: jar.sun-ejb-jar.xml
        jpa_jpa22_repeatable_converts_pmservlet_vehicle_web: WEB-INF/web.xml
        jpa_jpa22_repeatable_converts_puservlet_vehicle_web: WEB-INF/web.xml
        jpa_jpa22_repeatable_converts_stateless3_vehicle_client: META-INF/application-client.xml
        jpa_jpa22_repeatable_converts_stateless3_vehicle_ejb: jar.sun-ejb-jar.xml
        jpa_jpa22_repeatable_converts_vehicles: 

        Found Descriptors:
        Client:

        /com/sun/ts/tests/common/vehicle/appmanagedNoTx/appmanagedNoTx_vehicle_client.xml
        Ejb:

        Ear:

        */
        @TargetsContainer("tck-appclient")
        @OverProtocol("appclient")
        @Deployment(name = VEHICLE_ARCHIVE, order = 2)
        public static EnterpriseArchive createDeploymentVehicle(@ArquillianResource TestArchiveProcessor archiveProcessor) {
        // Client
            // the jar with the correct archive name
            JavaArchive jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_client = ShrinkWrap.create(JavaArchive.class, "jpa_jpa22_repeatable_converts_vehicles_client.jar");
            // The class files
            jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_client.addClasses(
            com.sun.ts.tests.common.vehicle.VehicleRunnerFactory.class,
            com.sun.ts.tests.common.vehicle.appmanagedNoTx.AppManagedNoTxVehicleIF.class,
            com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManager.class,
            com.sun.ts.tests.common.vehicle.ejb3share.EJB3ShareIF.class,
            com.sun.ts.lib.harness.EETest.Fault.class,
            com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManagerFactory.class,
            com.sun.ts.tests.common.vehicle.EmptyVehicleRunner.class,
            ee.jakarta.tck.persistence.common.PMClientBase.class,
            com.sun.ts.tests.common.vehicle.appmanagedNoTx.AppManagedNoTxVehicleRunner.class,
            com.sun.ts.tests.common.vehicle.VehicleRunnable.class,
            com.sun.ts.tests.common.vehicle.ejb3share.UserTransactionWrapper.class,
            com.sun.ts.lib.harness.EETest.class,
            com.sun.ts.lib.harness.ServiceEETest.class,
            com.sun.ts.tests.common.vehicle.ejb3share.EntityTransactionWrapper.class,
            com.sun.ts.lib.harness.EETest.SetupException.class,
            com.sun.ts.tests.common.vehicle.VehicleClient.class,
            com.sun.ts.tests.common.vehicle.ejb3share.NoopTransactionWrapper.class,
            ee.jakarta.tck.persistence.jpa22.repeatable.convert.Client.class,
            ClientAppmanagednotxTest.class
            );
            // The application-client.xml descriptor
            URL resURL = Client.class.getResource("/com/sun/ts/tests/common/vehicle/appmanagedNoTx/appmanagedNoTx_vehicle_client.xml");
            if(resURL != null) {
              jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_client.addAsManifestResource(resURL, "application-client.xml");
            }
            // The sun-application-client.xml file need to be added or should this be in in the vendor Arquillian extension?
            resURL = Client.class.getResource("/com/sun/ts/tests/common/vehicle/appmanagedNoTx/appmanagedNoTx_vehicle_client.jar.sun-application-client.xml");
            if(resURL != null) {
              jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_client.addAsManifestResource(resURL, "application-client.xml");
            }
            jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_client.addAsManifestResource(new StringAsset("Main-Class: " + Client.class.getName() + "\n"), "MANIFEST.MF");
            // Call the archive processor
            archiveProcessor.processClientArchive(jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_client, Client.class, resURL);

        // Ejb 1
            // the jar with the correct archive name
            JavaArchive jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_ejb = ShrinkWrap.create(JavaArchive.class, "jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_ejb.jar");
            // The class files
            jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_ejb.addClasses(
                com.sun.ts.tests.common.vehicle.ejb3share.EJB3ShareBaseBean.class,
                com.sun.ts.tests.common.vehicle.VehicleRunnerFactory.class,
                com.sun.ts.tests.common.vehicle.appmanagedNoTx.AppManagedNoTxVehicleIF.class,
                com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManager.class,
                com.sun.ts.tests.common.vehicle.ejb3share.EJB3ShareIF.class,
                com.sun.ts.lib.harness.EETest.Fault.class,
                com.sun.ts.tests.common.vehicle.ejb3share.UseEntityManagerFactory.class,
                ee.jakarta.tck.persistence.common.PMClientBase.class,
                ee.jakarta.tck.persistence.jpa22.repeatable.convert.Client.class,
                com.sun.ts.tests.common.vehicle.VehicleRunnable.class,
                com.sun.ts.tests.common.vehicle.ejb3share.UserTransactionWrapper.class,
                com.sun.ts.lib.harness.EETest.class,
                com.sun.ts.lib.harness.ServiceEETest.class,
                com.sun.ts.tests.common.vehicle.ejb3share.EntityTransactionWrapper.class,
                com.sun.ts.lib.harness.EETest.SetupException.class,
                com.sun.ts.tests.common.vehicle.VehicleClient.class,
                com.sun.ts.tests.common.vehicle.ejb3share.NoopTransactionWrapper.class,
                com.sun.ts.tests.common.vehicle.appmanagedNoTx.AppManagedNoTxVehicleBean.class
            );
            // The ejb-jar.xml descriptor
            URL ejbResURL1 = Client.class.getResource("/vehicle/appmanagedNoTx/appmanagedNoTx_vehicle_ejb.xml");
            if(ejbResURL1 != null) {
              jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_ejb.addAsManifestResource(ejbResURL1, "ejb-jar.xml");
            }
            // The sun-ejb-jar.xml file
            ejbResURL1 = Client.class.getResource("/vehicle/appmanagedNoTx/appmanagedNoTx_vehicle_ejb.jar.sun-ejb-jar.xml");
            if(ejbResURL1 != null) {
              jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_ejb.addAsManifestResource(ejbResURL1, "sun-ejb-jar.xml");
            }
            // Call the archive processor
            archiveProcessor.processEjbArchive(jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_ejb, Client.class, ejbResURL1);


        // Par
            // the jar with the correct archive name
            JavaArchive jpa_jpa22_repeatable_converts = ShrinkWrap.create(JavaArchive.class, "jpa_jpa22_repeatable_converts.jar");
            // The class files
            jpa_jpa22_repeatable_converts.addClasses(
                ee.jakarta.tck.persistence.jpa22.repeatable.convert.DotConverter.class,
                ee.jakarta.tck.persistence.jpa22.repeatable.convert.B.class,
                ee.jakarta.tck.persistence.jpa22.repeatable.convert.Address.class,
                ee.jakarta.tck.persistence.jpa22.repeatable.convert.Employee3.class,
                ee.jakarta.tck.persistence.jpa22.repeatable.convert.NumberToStateConverter.class
            );
            // The persistence.xml descriptor
            URL parURL = Client.class.getResource("persistence.xml");
            if(parURL != null) {
              jpa_jpa22_repeatable_converts.addAsManifestResource(parURL, "persistence.xml");
            }
            // Add the Persistence mapping-file
            URL mappingURL = Client.class.getResource("myMappingFile.xml");
            if(mappingURL != null) {
              jpa_jpa22_repeatable_converts.addAsResource(mappingURL, "myMappingFile.xml");
            }
            mappingURL = Client.class.getResource("myMappingFile1.xml");
            if(mappingURL != null) {
              jpa_jpa22_repeatable_converts.addAsResource(mappingURL, "myMappingFile1.xml");
            }
            mappingURL = Client.class.getResource("myMappingFile2.xml");
            if(mappingURL != null) {
              jpa_jpa22_repeatable_converts.addAsResource(mappingURL, "myMappingFile2.xml");
            }
            // Call the archive processor
            archiveProcessor.processParArchive(jpa_jpa22_repeatable_converts, Client.class, parURL);
            parURL = Client.class.getResource("orm.xml");
            if(parURL != null) {
              jpa_jpa22_repeatable_converts.addAsManifestResource(parURL, "orm.xml");
            }

        // Ear
            EnterpriseArchive jpa_jpa22_repeatable_converts_vehicles_ear = ShrinkWrap.create(EnterpriseArchive.class, "jpa_jpa22_repeatable_converts_vehicles.ear");

            // Any libraries added to the ear

            // The component jars built by the package target
            jpa_jpa22_repeatable_converts_vehicles_ear.addAsModule(jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_ejb);
            jpa_jpa22_repeatable_converts_vehicles_ear.addAsModule(jpa_jpa22_repeatable_converts_appmanagedNoTx_vehicle_client);

            jpa_jpa22_repeatable_converts_vehicles_ear.addAsLibrary(jpa_jpa22_repeatable_converts);



            // The application.xml descriptor
            URL earResURL = null;
            // The sun-application.xml descriptor
            earResURL = Client.class.getResource("/.ear.sun-application.xml");
            if(earResURL != null) {
              jpa_jpa22_repeatable_converts_vehicles_ear.addAsManifestResource(earResURL, "sun-application.xml");
            }
            // Call the archive processor
            archiveProcessor.processEarArchive(jpa_jpa22_repeatable_converts_vehicles_ear, Client.class, earResURL);
        return jpa_jpa22_repeatable_converts_vehicles_ear;
        }

        @Test
        @Override
        @TargetVehicle("appmanagedNoTx")
        public void convertsTest() throws java.lang.Exception {
            super.convertsTest();
        }


}