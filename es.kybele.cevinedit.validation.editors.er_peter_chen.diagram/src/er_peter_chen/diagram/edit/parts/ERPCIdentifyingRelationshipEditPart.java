package er_peter_chen.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class ERPCIdentifyingRelationshipEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2008;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ERPCIdentifyingRelationshipEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new er_peter_chen.diagram.edit.policies.ERPCIdentifyingRelationshipItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ERPCIdentifyingRelationshipFigure();
	}

	/**
	 * @generated
	 */
	public ERPCIdentifyingRelationshipFigure getPrimaryShape() {
		return (ERPCIdentifyingRelationshipFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipNameEditPart) {
			((er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureERPCIdentifyingRelationshipLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(150, 60);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
				.getType(er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ERPCIdentifyingRelationshipFigure extends ScalablePolygonShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureERPCIdentifyingRelationshipLabel;

		/**
		 * @generated
		 */
		public ERPCIdentifyingRelationshipFigure() {
			this.setLayoutManager(new XYLayout());
			this.addPoint(new Point(getMapMode().DPtoLP(75), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(160), getMapMode()
					.DPtoLP(30)));
			this.addPoint(new Point(getMapMode().DPtoLP(75), getMapMode()
					.DPtoLP(60)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(30)));
			this.addPoint(new Point(getMapMode().DPtoLP(75), getMapMode()
					.DPtoLP(0)));
			this.setFill(true);
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(150),
					getMapMode().DPtoLP(60)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(150),
					getMapMode().DPtoLP(60)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(150),
					getMapMode().DPtoLP(60)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			ScalablePolygonShape eRPCIdentifyingRelationshipPolygonInternal0 = new ScalablePolygonShape();

			eRPCIdentifyingRelationshipPolygonInternal0.addPoint(new Point(
					getMapMode().DPtoLP(72), getMapMode().DPtoLP(5)));
			eRPCIdentifyingRelationshipPolygonInternal0.addPoint(new Point(
					getMapMode().DPtoLP(140), getMapMode().DPtoLP(31)));
			eRPCIdentifyingRelationshipPolygonInternal0.addPoint(new Point(
					getMapMode().DPtoLP(72), getMapMode().DPtoLP(55)));
			eRPCIdentifyingRelationshipPolygonInternal0.addPoint(new Point(
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(31)));
			eRPCIdentifyingRelationshipPolygonInternal0.addPoint(new Point(
					getMapMode().DPtoLP(72), getMapMode().DPtoLP(5)));
			eRPCIdentifyingRelationshipPolygonInternal0.setFill(true);
			eRPCIdentifyingRelationshipPolygonInternal0.setLineWidth(2);
			eRPCIdentifyingRelationshipPolygonInternal0
					.setForegroundColor(ColorConstants.black);
			eRPCIdentifyingRelationshipPolygonInternal0
					.setPreferredSize(new Dimension(getMapMode().DPtoLP(140),
							getMapMode().DPtoLP(55)));
			eRPCIdentifyingRelationshipPolygonInternal0
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(140),
							getMapMode().DPtoLP(55)));
			eRPCIdentifyingRelationshipPolygonInternal0
					.setMinimumSize(new Dimension(getMapMode().DPtoLP(140),
							getMapMode().DPtoLP(55)));
			eRPCIdentifyingRelationshipPolygonInternal0
					.setBorder(new MarginBorder(getMapMode().DPtoLP(21),
							getMapMode().DPtoLP(40), getMapMode().DPtoLP(0),
							getMapMode().DPtoLP(0)));

			this.add(eRPCIdentifyingRelationshipPolygonInternal0,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode()
							.DPtoLP(0), getMapMode().DPtoLP(140), getMapMode()
							.DPtoLP(55)));
			eRPCIdentifyingRelationshipPolygonInternal0
					.setLayoutManager(new XYLayout());

			fFigureERPCIdentifyingRelationshipLabel = new WrappingLabel();

			fFigureERPCIdentifyingRelationshipLabel.setText("Set Label...");

			fFigureERPCIdentifyingRelationshipLabel
					.setFont(FFIGUREERPCIDENTIFYINGRELATIONSHIPLABEL_FONT);

			eRPCIdentifyingRelationshipPolygonInternal0
					.add(fFigureERPCIdentifyingRelationshipLabel);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureERPCIdentifyingRelationshipLabel() {
			return fFigureERPCIdentifyingRelationshipLabel;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREERPCIDENTIFYINGRELATIONSHIPLABEL_FONT = new Font(
			Display.getCurrent(), "Arial", 9, SWT.BOLD);

}
