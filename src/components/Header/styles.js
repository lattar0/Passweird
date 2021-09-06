import { Dimensions, StyleSheet } from "react-native";
import { theme } from "../../styles/theme";

export const styles = StyleSheet.create({
  header: {
    position: 'absolute',
    top: 0,
    paddingTop: Dimensions.get('window').width * 0.20,
    flex: 1,
    backgroundColor: 'transparent'
  },

  textHeader: {
    fontSize: 30,
    color: theme.colors.white,
    fontFamily: theme.fonts.semiBold
  }
})