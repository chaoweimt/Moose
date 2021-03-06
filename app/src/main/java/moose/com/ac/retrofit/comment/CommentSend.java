package moose.com.ac.retrofit.comment;

import java.io.Serializable;
/*
 * Copyright 2015,2016 Farble Dast
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Created by dell on 2016/3/24.
 * {"success":true,"commentId":56992725,"status":0}
 */
public class CommentSend implements Serializable {
    private static final long serialVersionUID = -8894878523945700523L;
    private boolean success;
    private float commentId;
    private int status;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public float getCommentId() {
        return commentId;
    }

    public void setCommentId(float commentId) {
        this.commentId = commentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
