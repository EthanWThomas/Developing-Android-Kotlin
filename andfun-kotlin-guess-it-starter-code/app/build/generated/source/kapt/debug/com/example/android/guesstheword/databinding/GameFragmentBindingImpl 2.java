package com.example.android.guesstheword.databinding;
import com.example.android.guesstheword.R;
import com.example.android.guesstheword.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class GameFragmentBindingImpl extends GameFragmentBinding implements com.example.android.guesstheword.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.word_is_text, 5);
        sViewsWithIds.put(R.id.timer_text, 6);
        sViewsWithIds.put(R.id.guideline, 7);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public GameFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private GameFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.correctButton.setTag(null);
        this.gameLayout.setTag(null);
        this.scoreText.setTag(null);
        this.skipButton.setTag(null);
        this.wordText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.android.guesstheword.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.android.guesstheword.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.gameViemModel == variableId) {
            setGameViemModel((com.example.android.guesstheword.screens.game.GameViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGameViemModel(@Nullable com.example.android.guesstheword.screens.game.GameViewModel GameViemModel) {
        this.mGameViemModel = GameViemModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.gameViemModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeGameViemModelWord((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeGameViemModelScore((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeGameViemModelWord(androidx.lifecycle.LiveData<java.lang.String> GameViemModelWord, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameViemModelScore(androidx.lifecycle.LiveData<java.lang.Integer> GameViemModelScore, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.android.guesstheword.screens.game.GameViewModel gameViemModel = mGameViemModel;
        java.lang.Integer gameViemModelScoreGetValue = null;
        java.lang.String wordTextAndroidStringQuoteFormatGameViemModelWord = null;
        java.lang.String gameViemModelWordGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> gameViemModelWord = null;
        androidx.lifecycle.LiveData<java.lang.Integer> gameViemModelScore = null;
        java.lang.String scoreTextAndroidStringScoreFormatGameViemModelScore = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (gameViemModel != null) {
                        // read gameViemModel.word
                        gameViemModelWord = gameViemModel.getWord();
                    }
                    updateLiveDataRegistration(0, gameViemModelWord);


                    if (gameViemModelWord != null) {
                        // read gameViemModel.word.getValue()
                        gameViemModelWordGetValue = gameViemModelWord.getValue();
                    }


                    // read @android:string/quote_format
                    wordTextAndroidStringQuoteFormatGameViemModelWord = wordText.getResources().getString(R.string.quote_format, gameViemModelWordGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (gameViemModel != null) {
                        // read gameViemModel.score
                        gameViemModelScore = gameViemModel.getScore();
                    }
                    updateLiveDataRegistration(1, gameViemModelScore);


                    if (gameViemModelScore != null) {
                        // read gameViemModel.score.getValue()
                        gameViemModelScoreGetValue = gameViemModelScore.getValue();
                    }


                    // read @android:string/score_format
                    scoreTextAndroidStringScoreFormatGameViemModelScore = scoreText.getResources().getString(R.string.score_format, gameViemModelScoreGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.correctButton.setOnClickListener(mCallback2);
            this.skipButton.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.scoreText, scoreTextAndroidStringScoreFormatGameViemModelScore);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.wordText, wordTextAndroidStringQuoteFormatGameViemModelWord);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // gameViemModel
                com.example.android.guesstheword.screens.game.GameViewModel gameViemModel = mGameViemModel;
                // gameViemModel != null
                boolean gameViemModelJavaLangObjectNull = false;



                gameViemModelJavaLangObjectNull = (gameViemModel) != (null);
                if (gameViemModelJavaLangObjectNull) {


                    gameViemModel.onSkip();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // gameViemModel
                com.example.android.guesstheword.screens.game.GameViewModel gameViemModel = mGameViemModel;
                // gameViemModel != null
                boolean gameViemModelJavaLangObjectNull = false;



                gameViemModelJavaLangObjectNull = (gameViemModel) != (null);
                if (gameViemModelJavaLangObjectNull) {


                    gameViemModel.onCorrect();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gameViemModel.word
        flag 1 (0x2L): gameViemModel.score
        flag 2 (0x3L): gameViemModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}