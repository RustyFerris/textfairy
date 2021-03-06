package com.renard.ocr.help;

import android.app.Dialog;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockDialogFragment;
import com.renard.ocr.R;

public class ReleaseNoteDialog extends SherlockDialogFragment {

	public final static String TAG = ReleaseNoteDialog.class.getSimpleName();

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		final String htmlPath = "file:///android_res/raw/release_notes.html";
		return HintDialog.createDialog(getActivity(), R.string.whats_new_title, htmlPath);
	}

}
