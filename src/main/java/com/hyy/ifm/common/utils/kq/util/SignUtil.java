/**
 *
 */
package com.hyy.ifm.common.utils.kq.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;


/**
 * @project mgwCore
 * @description:������ǩ
 * @author cen
 * @create_time:Jun 21, 2009
 * @modify_time:Jun 21, 2009
 */
public class SignUtil {

	/**
	 * @param data ��ǩ����ԭ�����ֽ����飬xmlȥ��signData�ڵ㡣
	 * @param signData ǩ���ֽ����顣
	 * @param certFile X.509��׼��֤���ļ���
	 * @return �����ǩͨ�����ͷ���true
	 * @throws RuntimeException
	 */
	public static boolean veriSign(byte[] data, byte[] signData, String certFile)
	                                                    throws RuntimeException{

		InputStream is = null;
		try {
			//���ع�Կ
			is = new FileInputStream(certFile);

			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			Certificate cert = cf.generateCertificate(is);

			PublicKey publicKey = cert.getPublicKey();

			Signature sig = Signature.getInstance("SHA1WithRSA");
			byte[] signed = Base64Binrary.decodeBase64Binrary(new String(signData));
			sig.initVerify(publicKey);
			sig.update(data);
			return sig.verify(signed);

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			if (is != null) {
				try{
					is.close();
				}catch(Exception e){
					throw new RuntimeException(e.getMessage(), e);
				}

			}
		}
	}

	/**
	 * @param tr3Xml tr3��xml��
	 * @param certFile X.509��׼��֤���ļ���
	 * @return �����ǩͨ���ͷ���true
	 * @throws RuntimeException
	 */

	public static boolean veriSignForXml(String tr3Xml)
{
		String certFile="";
		try {
			certFile = SignUtil.class.getResource("kq.cer").toURI().getPath();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String dataBeforeSign =  tr3Xml.replaceAll("<signature>.*</signature>", "");

		int beginIndex = tr3Xml.indexOf("<signature>");
		int endIndex = tr3Xml.indexOf("</signature>");
		String signData =  tr3Xml.substring(beginIndex + 11, endIndex);

		try {
			return veriSign(dataBeforeSign.getBytes("UTF-8"),
			        signData.getBytes("UTF-8"), certFile);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}

	}
}




