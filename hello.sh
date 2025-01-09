#!/bin/sh
OPENAI_API_KEY="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"
PROMPT="Tell me a joke"

curl "https://api.openai.com/v1/chat/completions" \
    -H "Content-Type: application/json" \
    -H "Authorization: Bearer $OPENAI_API_KEY" \
    -d '{
        "model": "gpt-4o-mini",
        "messages": [
            {
                "role": "system",
                "content": "'"${PROMPT}"'"
            }
        ]
    }'