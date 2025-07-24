/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.workflow.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Common constants for workflow API.
 */
public class Constants {

    private static final Log log = LogFactory.getLog(Constants.class);

    public static final String WORKFLOW_PREFIX = "WF-";
    public static final String APPROVAL_STEPS = "ApprovalSteps";
    public static final String APPROVAL_STEP = "Step-";
    public static final String TEMPLATE = "Template";
    public static final String STEP_NAME_DELIMITER = "-";
    public static final String PARAMETER_VALUE_SEPARATOR = ",";
    public static final String WORKFLOW_IMPLEMENTATION = "Workflowimpl";
    public static final String WORKFLOW_NAME = "WorkflowName";
    public static final int DEFAULT_OFFSET = 0;
    public static final String WORKFLOW_PATH_COMPONENT = "/workflows";
    public static final String WORKFLOW_ASSOCIATION_PATH_COMPONENT = "workflow-associations";

    private Constants() {

    }

    /**
     * Enum for error messages.
     */
    public enum ErrorMessage {

        // Client errors starting from 510xx.
        ERROR_CODE_WORKFLOW_NOT_FOUND("51001", "Resource not found.",
                "Unable to find a resource matching the provided workflow identifier %s."),
        ERROR_CODE_CLIENT_ERROR_LISTING_WORKFLOWS("51002", "Unable to list existing workflows",
                "Encountered an error while listing the workflows."),
        ERROR_CODE_CLIENT_ERROR_ADDING_WORKFLOW("51003", "Unable to add workflow",
                "Encountered an error while adding the workflow."),
        ERROR_CODE_CLIENT_ERROR_UPDATING_WORKFLOW("51004", "Unable to update workflow",
                "Encountered an error while updating the workflow for identifier %s."),
        ERROR_CODE_ASSOCIATION_NOT_FOUND("51005", "Resource not found.",
                "Unable to find a resource matching the provided workflow association identifier %s."),
        ERROR_CODE_CLIENT_ERROR_LISTING_ASSOCIATIONS("51006", "Unable to list existing workflow " +
                "associations", "Encountered an error while listing the workflow associations."),
        ERROR_CODE_CLIENT_ERROR_ADDING_ASSOCIATION("51007", "Unable to add workflow association",
                "Encountered an error while adding the workflow association with the name %s."),
        ERROR_CODE_CLIENT_ERROR_UPDATING_ASSOCIATION("51008", "Unable to update workflow association",
                "Encountered an error while updating the workflow association."),
        ERROR_CODE_INVALID_PAGINATION_PARAMETER_NEGATIVE_LIMIT("51009", "Invalid pagination parameters.", "'limit' " +
                "shouldn't be negative."),


        // Server Errors starting from 500xx.
        ERROR_CODE_ERROR_LISTING_WORKFLOWS("50020", "Unable to list existing workflows",
                                                   "Server encountered an error while listing the workflows."),
        ERROR_CODE_ERROR_REMOVING_WORKFLOW("50021", "Unable to delete the workflow",
                                                   "Server encountered an error while deleting " +
                                                           "the workflow for the identifier %s."),
        ERROR_CODE_ERROR_RETRIEVING_WORKFLOW("50022", "Unable to retrieve workflow.",
                                                     "Server encountered an error while " +
                                                             "retrieving the workflow for identifier %s."),
        ERROR_CODE_ERROR_ADDING_WORKFLOW("50023", "Unable to add workflow",
                                                 "Server encountered an error while adding the workflow."),
        ERROR_CODE_ERROR_UPDATING_WORKFLOW("50024", "Unable to update workflow",
                                                   "Server encountered an error while updating the " +
                                                           "workflow for identifier %s."),
        ERROR_CODE_ERROR_ADDING_ASSOCIATION("50025", "Unable to add workflow association",
                                                    "Server encountered an error while adding " +
                                                            "the workflow association with the name %s."),
        ERROR_CODE_ERROR_LISTING_ASSOCIATIONS("50026", "Unable to list existing workflow associations",
                                                      "Server encountered an error while " +
                                                              "listing the workflow associations."),
        ERROR_CODE_ERROR_REMOVING_ASSOCIATION("50027", "Unable to delete the workflow association",
                                                      "Server encountered an error while deleting " +
                                                              "the workflow association."),
        ERROR_CODE_ERROR_RETRIEVING_ASSOCIATION("50028", "Unable to retrieve workflow association.",
                                                        "Server encountered an error while retrieving " +
                                                                "the workflow association for identifier %s."),
        ERROR_CODE_ERROR_UPDATING_ASSOCIATION("50029", "Unable to update workflow association",
                                                      "Server encountered an error while " +
                                                              "updating the workflow association.");

        private final String code;
        private final String message;
        private final String description;

        ErrorMessage(String code, String message, String description) {

            this.code = code;
            this.message = message;
            this.description = description;
        }

        public String getCode() {

            if (log.isDebugEnabled()) {
                log.debug("Retrieving error code with prefix: " + (WORKFLOW_PREFIX + code));
            }
            return WORKFLOW_PREFIX + code;
        }

        public String getMessage() {

            if (log.isDebugEnabled()) {
                log.debug("Retrieving error message: " + message);
            }
            return message;
        }

        public String getDescription() {

            if (log.isDebugEnabled()) {
                log.debug("Retrieving error description: " + description);
            }
            return description;
        }

        @Override
        public String toString() {

            return code + " | " + message;
        }
    }
}
