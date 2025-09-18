import gradio as gr
from transformers import pipeline

# Load text generation model
story_generator = pipeline("text2text-generation", model="google/flan-t5-base")

def create_story(name, issue, impact):
    prompt = f"Write an inspiring and positive community story about {name} who worked on {issue}. Show the impact: {impact}. Keep it short and friendly."
    result = story_generator(prompt, max_length=200)
    story_text = result[0]['generated_text']

    formatted_story = f"""
    # 🌟 **Community Impact Story** 🌟

    **Hero:** {name}  
    **Challenge:** {issue}  
    **Impact:** {impact}  

    ---
    ### Story:
    {story_text}

    _Let's celebrate {name}'s efforts!_
    """

    return formatted_story

iface = gr.Interface(
    fn=create_story,
    inputs=[
        gr.Textbox(label="Your Name"),
        gr.Textbox(label="Community Issue"),
        gr.Textbox(label="Impact/Result")
    ],
    outputs=gr.Markdown(label="Generated Story"),
    title="🌈 Social Good Storytelling Bot",
    description="Enter your name, the issue you worked on, and the impact. Get a beautiful story!"
)

iface.launch()
