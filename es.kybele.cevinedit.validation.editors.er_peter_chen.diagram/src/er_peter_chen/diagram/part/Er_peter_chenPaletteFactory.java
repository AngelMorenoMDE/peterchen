package er_peter_chen.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class Er_peter_chenPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createEr_peter_chen1Group());
	}

	/**
	 * Creates "er_peter_chen" palette tool group
	 * @generated
	 */
	private PaletteContainer createEr_peter_chen1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				er_peter_chen.diagram.part.Messages.Er_peter_chen1Group_title);
		paletteContainer.setId("createEr_peter_chen1Group"); //$NON-NLS-1$
		paletteContainer.add(createERPCEntityRelationshipLink1CreationTool());
		paletteContainer.add(createERPCEntityAttributeLink2CreationTool());
		paletteContainer
				.add(createERPCRelationshipAttributeLink3CreationTool());
		paletteContainer.add(createERPCRegularRelationship4CreationTool());
		paletteContainer.add(createERPCIdentifyingRelationship5CreationTool());
		paletteContainer.add(createERPCRegularAttribute6CreationTool());
		paletteContainer.add(createERPCPrimaryKeyAttribute7CreationTool());
		paletteContainer.add(createERPCWeakKeyAttribute8CreationTool());
		paletteContainer.add(createERPCDerivedAttribute9CreationTool());
		paletteContainer.add(createERPCMultiValuedAttribute10CreationTool());
		paletteContainer.add(createERPCRegularEntity11CreationTool());
		paletteContainer.add(createERPCWeakEntity12CreationTool());
		paletteContainer
				.add(createERPCCompositeAttributeAttributeLink13CreationTool());
		paletteContainer.add(createERPCCompositeAttribute14CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCEntityRelationshipLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCEntityRelationshipLink1CreationTool_title,
				er_peter_chen.diagram.part.Messages.ERPCEntityRelationshipLink1CreationTool_desc,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityRelationshipLink_4002));
		entry.setId("createERPCEntityRelationshipLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityRelationshipLink_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCEntityAttributeLink2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCEntityAttributeLink2CreationTool_title,
				er_peter_chen.diagram.part.Messages.ERPCEntityAttributeLink2CreationTool_desc,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003));
		entry.setId("createERPCEntityAttributeLink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCRelationshipAttributeLink3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCRelationshipAttributeLink3CreationTool_title,
				er_peter_chen.diagram.part.Messages.ERPCRelationshipAttributeLink3CreationTool_desc,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRelationshipAttributeLink_4001));
		entry.setId("createERPCRelationshipAttributeLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRelationshipAttributeLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCRegularRelationship4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCRegularRelationship4CreationTool_title,
				er_peter_chen.diagram.part.Messages.ERPCRegularRelationship4CreationTool_desc,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularRelationship_2006));
		entry.setId("createERPCRegularRelationship4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularRelationship_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCIdentifyingRelationship5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCIdentifyingRelationship5CreationTool_title,
				er_peter_chen.diagram.part.Messages.ERPCIdentifyingRelationship5CreationTool_desc,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCIdentifyingRelationship_2008));
		entry.setId("createERPCIdentifyingRelationship5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCIdentifyingRelationship_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCRegularAttribute6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCRegularAttribute6CreationTool_title,
				er_peter_chen.diagram.part.Messages.ERPCRegularAttribute6CreationTool_desc,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularAttribute_2009));
		entry.setId("createERPCRegularAttribute6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularAttribute_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCPrimaryKeyAttribute7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCPrimaryKeyAttribute7CreationTool_title,
				er_peter_chen.diagram.part.Messages.ERPCPrimaryKeyAttribute7CreationTool_desc,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCPrimaryKeyAttribute_2007));
		entry.setId("createERPCPrimaryKeyAttribute7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCPrimaryKeyAttribute_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCWeakKeyAttribute8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCWeakKeyAttribute8CreationTool_title,
				er_peter_chen.diagram.part.Messages.ERPCWeakKeyAttribute8CreationTool_desc,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakKeyAttribute_2004));
		entry.setId("createERPCWeakKeyAttribute8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakKeyAttribute_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCDerivedAttribute9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCDerivedAttribute9CreationTool_title,
				er_peter_chen.diagram.part.Messages.ERPCDerivedAttribute9CreationTool_desc,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCDerivedAttribute_2001));
		entry.setId("createERPCDerivedAttribute9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCDerivedAttribute_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCMultiValuedAttribute10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCMultiValuedAttribute10CreationTool_title,
				er_peter_chen.diagram.part.Messages.ERPCMultiValuedAttribute10CreationTool_desc,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCMultiValuedAttribute_2005));
		entry.setId("createERPCMultiValuedAttribute10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCMultiValuedAttribute_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCRegularEntity11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCRegularEntity11CreationTool_title,
				er_peter_chen.diagram.part.Messages.ERPCRegularEntity11CreationTool_desc,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularEntity_2003));
		entry.setId("createERPCRegularEntity11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularEntity_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCWeakEntity12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCWeakEntity12CreationTool_title,
				er_peter_chen.diagram.part.Messages.ERPCWeakEntity12CreationTool_desc,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakEntity_2002));
		entry.setId("createERPCWeakEntity12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakEntity_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCCompositeAttributeAttributeLink13CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCCompositeAttributeAttributeLink13CreationTool_title,
				null,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttributeComposedAttributes_4004));
		entry.setId("createERPCCompositeAttributeAttributeLink13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttributeComposedAttributes_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createERPCCompositeAttribute14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				er_peter_chen.diagram.part.Messages.ERPCCompositeAttribute14CreationTool_title,
				null,
				Collections
						.singletonList(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttribute_2010));
		entry.setId("createERPCCompositeAttribute14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(er_peter_chen.diagram.providers.Er_peter_chenElementTypes
				.getImageDescriptor(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttribute_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
