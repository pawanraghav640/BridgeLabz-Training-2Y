import gradio as gr
from transformers import pipeline

# Load text generation model (lightweight and CPU-friendly)
story_generator = pipeline("text2text-generation", model="google/flan-t5-base")

def create_story(name, issue, impact):
    # Prompt for story
    prompt = (
        f"Write a short, inspiring community story about {name} "
        f"who worked on {issue}. Show the positive impact: {impact}. "
        f"Keep it friendly and motivational."
    )

    # Generate text
    result = story_generator(prompt, max_length=150, num_return_sequences=1)
    story_text = result[0]['generated_text']

    # Nicely formatted Markdown
    formatted_story = f"""
    # 🌟 **Community Impact Story** 🌟

    **Hero:** {name}  
    **Challenge:** {issue}  
    **Impact:** {impact}  

    ---
    ### Story:
    {story_text}

    _👏 Let's celebrate {name}'s efforts!_
    """
    return formatted_story

# Build interface
iface = gr.Interface(
    fn=create_story,
    inputs=[
        gr.Textbox(label="Your Name", placeholder="Enter your name"),
        gr.Textbox(label="Community Issue", placeholder="What problem did you solve?"),
        gr.Textbox(label="Impact/Result", placeholder="What was the positive outcome?")
    ],
    outputs=gr.Markdown(label="Generated Story"),
    title="🌈 Social Good Storytelling Bot",
    description="Enter details and get an inspiring story instantly!",
    theme="soft"
)

# Run app
iface.launch()
