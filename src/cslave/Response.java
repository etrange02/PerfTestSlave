/**
 * 
 */
package cslave;

import cslave.interfaces.IResponse;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Etrange02
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Response implements IResponse {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer delay = 0;

	/** 
	 * @return delay
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getDelay() {
		// begin-user-code
		return delay;
		// end-user-code
	}

	/** 
	 * @param delay delay � d�finir
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDelay(Integer delay) {
		// begin-user-code
		this.delay = delay;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte[] serverBinaryResponse;

	/** 
	 * @return serverBinaryResponse
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte[] getServerBinaryResponse() {
		// begin-user-code
		return serverBinaryResponse;
		// end-user-code
	}

	/** 
	 * @param serverBinaryResponse serverBinaryResponse � d�finir
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setServerBinaryResponse(byte[] serverBinaryResponse) {
		// begin-user-code
		this.serverBinaryResponse = serverBinaryResponse;
		// end-user-code
	}
}