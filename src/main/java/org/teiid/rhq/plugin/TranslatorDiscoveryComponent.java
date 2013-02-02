/*
 * JBoss, Home of Professional Open Source.
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 */
package org.teiid.rhq.plugin;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.rhq.core.domain.configuration.Configuration;
import org.rhq.core.domain.configuration.PropertyList;
import org.rhq.core.domain.configuration.PropertyMap;
import org.rhq.core.domain.configuration.PropertySimple;
import org.rhq.core.pluginapi.inventory.DiscoveredResourceDetails;
import org.rhq.core.pluginapi.inventory.InvalidPluginConfigurationException;
import org.rhq.core.pluginapi.inventory.ResourceDiscoveryComponent;
import org.rhq.core.pluginapi.inventory.ResourceDiscoveryContext;
import org.rhq.modules.plugins.jbossas7.ASConnection;
import org.teiid.core.util.ApplicationInfo;
import org.teiid.rhq.plugin.util.PluginConstants;
import org.teiid.rhq.plugin.util.DmrUtil;

/**
 * Discovery component for Teiid Translator instances
 * 
 */
public class TranslatorDiscoveryComponent implements ResourceDiscoveryComponent {

	private final Log log = LogFactory.getLog(PluginConstants.DEFAULT_LOGGER_CATEGORY);

	public Set<DiscoveredResourceDetails> discoverResources(
			ResourceDiscoveryContext discoveryContext)
			throws InvalidPluginConfigurationException, Exception {
		Set<DiscoveredResourceDetails> discoveredResources = new HashSet<DiscoveredResourceDetails>();
		ASConnection connection = ((PlatformComponent) discoveryContext
				.getParentResourceComponent()).getASConnection();
	
//		Set<ManagedComponent> translators = ProfileServiceUtil
//				.getManagedComponents(connection, new ComponentType(
//						PluginConstants.ComponentType.Translator.TYPE,
//						PluginConstants.ComponentType.Translator.SUBTYPE));
//
//		for (ManagedComponent translator : translators) {
//
//			String translatorKey = translator.getName();
//			String translatorName = ProfileServiceUtil.getSimpleValue(translator, "name", String.class); //$NON-NLS-1$
//			String description = ProfileServiceUtil.getSimpleValue(translator, "description", String.class); //$NON-NLS-1$
//			
//			/**
//			 * 
//			 * A discovered resource must have a unique key, that must stay the
//			 * same when the resource is discovered the next time
//			 */
//			DiscoveredResourceDetails detail = new DiscoveredResourceDetails(
//					discoveryContext.getResourceType(), // ResourceType
//					translatorKey, // Resource Key
//					translatorName, // Resource Name
//					ApplicationInfo.getInstance().getReleaseNumber(), // Version
//					description, // Description
//					discoveryContext.getDefaultPluginConfiguration(), // Plugin config
//					null // Process info from a process scan
//			);
//
//			// Get plugin config map for models
//			Configuration configuration = detail.getPluginConfiguration();
//
//			configuration.put(new PropertySimple("name", translatorName));//$NON-NLS-1$
//			detail.setPluginConfiguration(configuration);
//			
//			 // Add to return values
//			// First get translator specific properties
//			ManagedProperty translatorProps = translator.getProperty("property");//$NON-NLS-1$
//			PropertyList list = new PropertyList("translatorList");//$NON-NLS-1$
//			PropertyMap propMap = null;
//			getTranslatorValues(translatorProps.getValue(), propMap, list);
//
//			// Now get common properties
//			configuration.put(new PropertySimple("name", translatorName));//$NON-NLS-1$
//			configuration.put(new PropertySimple("type",ProfileServiceUtil.getSimpleValue(translator,"type", String.class)));//$NON-NLS-1$ //$NON-NLS-2$
//
//			detail.setPluginConfiguration(configuration);
//			// Add to return values
//			discoveredResources.add(detail);
//			log.debug("Discovered Teiid Translator: " + translatorName);
//		}

		return discoveredResources;
	}


//	public static <T> void getTranslatorValues(MetaValue pValue,
//			PropertyMap map, PropertyList list) throws Exception {
//		MetaType metaType = pValue.getMetaType();
//		MapCompositeValueSupport unwrappedvalue = null;
//		if (metaType.isComposite()) {
//			unwrappedvalue = (MapCompositeValueSupport)pValue;
//
//			for (String key : unwrappedvalue.getMetaType().keySet()) {
//				map = new PropertyMap("properties");//$NON-NLS-1$
//				map.put(new PropertySimple("name", key));//$NON-NLS-1$
//				map.put(new PropertySimple("value", ProfileServiceUtil.stringValue((MetaValue)unwrappedvalue.get(key))));//$NON-NLS-1$
//				list.add(map);
//			}
//		} else {
//			throw new IllegalStateException(pValue + " is not a Composite type");
//		}
//
//	}

}