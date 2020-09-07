package autoId;

public class AutoID {

	private String affterID;

	public String genID(String beforeID, String prefix, int uperUnit, int length, String charCode) {
		if (beforeID != null) {
			uperUnit = Integer.parseInt(beforeID.substring(length - String.valueOf(uperUnit).length(), length))
					+ uperUnit;
		}
		int CharCodeRepeat = (length - prefix.length() - String.valueOf(uperUnit).length()) / charCode.length() + 1;
		String charCodeFull = charCode.repeat(CharCodeRepeat).substring(0,
				length - prefix.length() - String.valueOf(uperUnit).length());

		affterID = prefix + charCodeFull + String.valueOf(uperUnit);
		return affterID;
	}
}
