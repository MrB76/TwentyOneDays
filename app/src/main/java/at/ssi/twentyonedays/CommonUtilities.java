package at.ssi.twentyonedays;

import android.content.Context;
import android.content.Intent;

public final class CommonUtilities {
	
	// give your server registration url here
    //static final String SERVER_URL = "http://berni2.ssi.at/register.php";
    static final String SERVER_URL = "https://center.ssi.at/android/register.php";
    // Google project id
    static final String SENDER_ID = "1045385941301";

    /**
     * Tag used on log messages.
     */
    static final String TAG = "21Days-Challenge";

    static final String DISPLAY_MESSAGE_ACTION =
            "at.ssi.twentyonedays.DISPLAY_MESSAGE";

    static final String EXTRA_MESSAGE = "message";

    /**
     * Notifies UI to display a message.
     * <p>
     * This method is defined in the common helper because it's used both by
     * the UI and the background service.
     *
     * @param context application's context.
     * @param message message to be displayed.
     */
    static void displayMessage(Context context, String message) {
        Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
        intent.putExtra(EXTRA_MESSAGE, message);
        context.sendBroadcast(intent);
    }
}
