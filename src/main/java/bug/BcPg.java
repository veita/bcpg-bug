
package bug;


import org.bouncycastle.openpgp.PGPUtil;


public class BcPg
{
	public static void main(String[] args)
	{
		// invoke a method on org.bouncycastle.openpgp.PGPUtil
		PGPUtil.getDigestIDForName("foo");
	}
}
