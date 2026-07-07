CREATE TABLE IF NOT EXISTS TASKS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR,
    status VARCHAR,
    creator_id BIGINT,
    assignee_id BIGINT
);
