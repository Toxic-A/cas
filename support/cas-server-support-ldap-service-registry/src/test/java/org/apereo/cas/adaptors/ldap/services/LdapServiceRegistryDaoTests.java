package org.apereo.cas.adaptors.ldap.services;

import org.apereo.cas.adaptors.ldap.LdapIntegrationTestsOperations;
import org.apereo.cas.util.CoreTestUtils;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.test.context.TestPropertySource;

/**
 * Unit test for {@link LdapServiceRegistryDao} class.
 *
 * @author Misagh Moayyed
 * @author Marvin S. Addison
 * @since 4.0.0
 */
@TestPropertySource(locations = "classpath:/ldapsvc.properties")
public class LdapServiceRegistryDaoTests extends BaseLdapServiceRegistryDaoTests {

    @Before
    public void setup() {
        CoreTestUtils.checkContinuousIntegrationBuild(false);
    }

    @BeforeClass
    public static void bootstrap() throws Exception {
        CoreTestUtils.checkContinuousIntegrationBuild(false);
        LdapIntegrationTestsOperations.initDirectoryServer(1390);
    }
}
