#!/bin/bash
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