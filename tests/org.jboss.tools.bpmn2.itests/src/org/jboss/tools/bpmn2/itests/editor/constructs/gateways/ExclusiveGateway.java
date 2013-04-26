package org.jboss.tools.bpmn2.itests.editor.constructs.gateways;

import org.jboss.tools.bpmn2.itests.editor.ConstructType;
import org.jboss.tools.bpmn2.itests.editor.constructs.AbstractGateway;

/**
 * 
 * @author Marek Baluch <mbaluch@redhat.com>
 */
public class ExclusiveGateway extends AbstractGateway {
	
	/**
	 * 
	 * @param name
	 */
	public ExclusiveGateway(String name) {
		super(name, ConstructType.EXCLUSIVE_GATEWAY);
	}

	/**
	 * @see org.jboss.tools.bpmn2.itests.editor.constructs.AbstractGateway#setDirection(org.jboss.tools.bpmn2.itests.editor.constructs.AbstractGateway.Direction)
	 */
	@Override
	public void setDirection(Direction direction) {
		super.setDirection(direction);
	}
	
	/**
	 * @see org.jboss.tools.bpmn2.itests.editor.constructs.AbstractGateway#setCondition(java.lang.String, java.lang.String)
	 */
	@Override
	public void setCondition(String branch, String condition) {
		super.setCondition(branch, condition);
	}

	/**
	 * @see org.jboss.tools.bpmn2.itests.editor.constructs.AbstractGateway#setDefaultBranch(java.lang.String)
	 */
	@Override
	public void setDefaultBranch(String branch) {
		super.setDefaultBranch(branch);
	}
	
}